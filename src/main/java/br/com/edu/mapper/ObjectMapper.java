package br.com.edu.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.List;

public class ObjectMapper {

    private static final Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O,D> D parseObject(O origin, Class <D> destination){
        return mapper.map(origin, destination);
    }

    public static <O,D> List<D> parseListObject(List<O> origin, Class <D> destination){
        List<D> destinationList = new ArrayList<> ();
        origin.forEach(o -> destinationList.add(mapper.map(o, destination)));
        return destinationList;
    }


}
