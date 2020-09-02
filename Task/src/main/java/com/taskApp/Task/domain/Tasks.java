package com.taskApp.Task.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor

public class Tasks {


    @Id
    @GeneratedValue
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Long id;
    private String name;


}
