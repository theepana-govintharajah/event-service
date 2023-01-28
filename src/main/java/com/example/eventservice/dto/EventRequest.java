package com.example.eventservice.dto;


import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EventRequest {
    private String name;
    private String venue;
    private Date startDate;
}
