package com.itcast.service;

import com.itcast.domain.Items;
import org.springframework.stereotype.Service;

@Service
public interface ItemsService {


    Items findById(Integer id);

}
