package com.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by david on 6/4/16.
 */
@Component
public class UserService {
    private Map<Integer, User> users = new HashMap();
    {
        users.put(1, new User(1, "Kenan", "5554332088", 37));
        users.put(2, new User(2, "Mert", "5552345060", 34));
    }

    @Autowired
    private CacheManager cacheManager;

    @PostConstruct
    public void setup(){
        Cache usersCache = cacheManager.getCache("users");
        for(Integer key: users.keySet()){
            usersCache.put(key, users.get(key));
        }
    }

    @Cacheable(value = "users", condition = "#user.age < 35")
    public User getUser(int id){
        System.out.println("User with id " + id + " requested.");
        return users.get(id);
    }

    @CacheEvict("users")
    public void removeUser(int id){
        users.remove(id);
    }

    @CachePut(value = "users")
    public User updateUser(int id){
        return users.get(id);
    }
}
