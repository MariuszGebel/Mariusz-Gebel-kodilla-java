package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

   @Autowired
   @Qualifier("listToDo")
   TaskList toDoList;

   @Autowired
   @Qualifier("listInProgress")
   TaskList inProgressList;

   @Autowired
   @Qualifier("listDone")
   TaskList doneList;

   @Bean(name = "listToDo")
   @Scope("prototype")
   public TaskList getListToDo() {
       return new TaskList();
   }

   @Bean(name = "listInProgress")
   @Scope("prototype")
   public TaskList getListInProgress() {
       return new TaskList();
   }

   @Bean(name = "listDone")
   @Scope("prototype")
   public TaskList getListDone() {
       return new TaskList();
   }

   @Bean
   public Board getBoard() {
       return new Board(toDoList, inProgressList, doneList);
   }
}
