package com.example.scutaru.service;

import java.io.IOException;
import java.util.List;

import com.example.scutaru.domain.Alarm;
import com.example.scutaru.dto.TemperatureDTO;

public interface TemperatureService {

	List<TemperatureDTO> getTemperature() throws IOException;

	Alarm saveTemperatureAlarms();
}
