package com.codingshuttle.week1.IntroductionTospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    private final DB dB;
      public DBService(DB dB){
          this.dB=dB;
      }
    String getData(){
         return  dB.getData();
    }

}
