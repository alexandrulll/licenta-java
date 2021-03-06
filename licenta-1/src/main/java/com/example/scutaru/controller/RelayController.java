package com.example.scutaru.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scutaru.service.RelayService;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.i2c.I2CFactory.UnsupportedBusNumberException;

@RestController
@RequestMapping(value = "/relay")
public class RelayController {

	private RelayService relayService;

	@Autowired
	public RelayController(RelayService relayService) {
		this.relayService = relayService;
	}

	@GetMapping("/{gpioPin}/{isOn}")
	public ResponseEntity<PinState> switchOnRelay(@PathVariable Integer gpioPin, @PathVariable Boolean isOn)
			throws UnsupportedBusNumberException, IOException, InterruptedException {

		return new ResponseEntity<PinState>(relayService.switchOnOffRelay(gpioPin, isOn), HttpStatus.CREATED);
	}
}