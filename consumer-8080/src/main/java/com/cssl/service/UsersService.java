package com.cssl.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("MICROSERVICE-DEPT")
public interface UsersService {


}
