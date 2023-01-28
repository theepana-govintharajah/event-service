package com.example.eventservice.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventResponse {
    private Integer id;
    private String name;
    private String venue;
    private Date startDate;
}
