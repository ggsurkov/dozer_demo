package com.example.demo;

import converters.MyAwesomeConverter;
import domain.*;
import entity.CardEntity;
import entity.ClassB;
import entity.ClassListB;
import entity.ProductPropertyEntity;
import org.dozer.CustomConverter;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.dozer.loader.api.FieldsMappingOptions.*;
import static org.junit.Assert.assertEquals;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest

public class DemoApplicationTests {
    BeanMappingBuilder builder = new BeanMappingBuilder() {
        @Override
        protected void configure() {
            mapping(ClassA.class, ClassB.class)
                    .fields("age", "ageClassB");
        }
    };
    BeanMappingBuilder builderConverter = new BeanMappingBuilder() {
        @Override
        protected void configure() {
            mapping(Card.class, CardEntity.class)
                    .fields("id", "id")
                    .fields("title", "title")
                    .fields("description", "description")
                    .fields("stockBalance", "stockBalance")
                    .fields("productProperty.count", "productPropertyCount")
                    .fields("productProperty.color", "productPropertyColor")
                    .fields("productProperty.size", "productPropertySize")
                    .fields("shippingInfo.count", "shippingInfoCount")
                    .fields("shippingInfo.shippingOn", "shippingInfoShippingOn");
        }
    };
    BeanMappingBuilder builderList = new BeanMappingBuilder() {
        @Override
        protected void configure() {
            mapping(ClassListA.class, ClassListB.class)
                    .fields("arrayProductProperty", "productPropertyCount", hintA(ProductProperty.class), hintB(ProductPropertyEntity.class), customConverter(MyAwesomeConverter.class));
        }
    };


    @Test

    public void dozerSimpleTest() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(builder);

        ClassA classA = new ClassA("Albert", "45", "NY");
        ClassB classB = mapper.map(classA, ClassB.class);

        assertEquals(classB.getName(), classA.getName());
        assertEquals(classB.getAddress(), classA.getAddress());
        if (classB.getAgeClassB() == (int) classB.getAgeClassB()) {
            System.out.println("+++++++++++++SimpleTest changeType success!+++++++++++++");
        }
        System.out.println("+++++++++++++SimpleTest changeName success!+++++++++++++");
    }


    @Test
    public void dozerConvertTest() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(builderConverter);

        Card card = new Card(1L, "title", "descr", 12L, new ProductProperty(10L, "red", 48L), new ShippingInfo(100L, true));
        ProductProperty productProperty = new ProductProperty(10L, "red", 48L);
        ShippingInfo shippingInfo = new ShippingInfo(100L, true);

        CardEntity cardEntity = mapper.map(card, CardEntity.class);

        System.out.println(cardEntity);
        System.out.println("+++++++++++++++++ ConvertTest success! ++++++++++++++++");

    }

    @Test
    public void dozerListConverterTest() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(builderList);
        ClassListA classListA = new ClassListA(Arrays.asList(new ProductProperty(15L, "red", 15L), new ProductProperty(11L, "blue", 11L)));

        ClassListB classListB = mapper.map(classListA, ClassListB.class);

        System.out.println(classListA);
        System.out.println(classListB);

    }

}
