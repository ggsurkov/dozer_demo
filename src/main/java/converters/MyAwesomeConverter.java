package converters;

import domain.ClassListA;
import domain.ProductProperty;
import org.dozer.CustomConverter;

import java.util.List;
import java.util.stream.Collectors;

public class MyAwesomeConverter implements CustomConverter {

    @Override
    public Object convert(Object dest, Object source, Class<?> aClass, Class<?> aClass1) {

        return ((List<ProductProperty>)source).stream().map(ProductProperty::getCount).collect(Collectors.toList());
    }


}
