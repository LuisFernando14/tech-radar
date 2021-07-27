package com.deiva.deiva;

import an.awesome.pipelinr.Pipeline;
import com.deiva.deiva.infraestructure.Users;
import com.deiva.deiva.model.entities.User;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@DgsComponent
public class UsersDataFetcher {
    @Autowired
    Pipeline pipeline;

    @DgsQuery
    public List<User> users(@InputArgument String titleFilter) {
        Iterable<User> response = new Users().execute(pipeline);
        List<User> list = StreamSupport
                .stream(response.spliterator(), false)
                .collect(Collectors.toList());
        if(titleFilter == null) {
            return list;
        }

        return list.stream().filter(s -> s.getTitle().contains(titleFilter)).collect(Collectors.toList());
    }
}
