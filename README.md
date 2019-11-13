# smart-home
A complex project that includes itself a few sub-projects: UDP server and Arduino images

[![Build Status](https://travis-ci.org/zhurlik/smart-home.svg?branch=master)](https://travis-ci.org/zhurlik/smart-home)
[![Coverage Status](https://coveralls.io/repos/github/zhurlik/smart-home/badge.svg?branch=master)](https://coveralls.io/github/zhurlik/smart-home?branch=master)

# Gradle Sub Projects
- **[mqtt-broker](./mqtt-broker)** - MQTT Broker based on ActiveMQ
- **[mqtt-client](./mqtt-client)** - Spring Boot Application for handling MQTT messages
- **[sphinx-app](./sphinx-app)** - Spring Boot Application for speech recognition
- **[udp-server](./udp-server)** - Spring Boot Application that ups UDP server
- **[arduino:ide](./arduino/ide)** - a gradle project based on [arduino plugin](https://github.com/zhurlik/gradle-arduino-plugin) for installing **Arduino Studio**
- **[arduino:bootloader](./arduino/bootloader)** - a gradle project that makes bootloader for connecting **TFTP Server** with Arduino images
- **[arduino:*](./arduino)** - snippets and sketches for Arduino devices
- **[web](./web)** - a web application that is based on the following **NodeJs** frameworks and libs: webpack, react, material-ui and stompjs
 
# A couple of links
1. [Arduino IDE](https://www.arduino.cc/en/Main/Software)
2. [TFTP Server](https://help.ubuntu.com/community/TFTP)
3. [TFTP Ethernet bootloader for ATmega328P and ENC28J60](https://github.com/mitxela/kiloboot)
4. [Gradle plugin for Arduino IDE](https://github.com/zhurlik/gradle-arduino-plugin)
http://forum.arduino.cc/index.php?topic=172346.0
https://github.com/arduino/Arduino
5. [Gradle+NodeJs without plugins](https://github.com/zhurlik/gradle-nodejs)
