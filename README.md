# WeatherApp

**Author**: Predescu Sebastian-Ion

## Overview

This is a simple Spring Boot web Weather App built with Thymeleaf. <br>
It allows users to search for the current weather in any city by querying the [WeatherAPI](https://www.weatherapi.com). <br>
The app fetches real-time weather data (temperature, feels-like, and condition) and displays it in a clean, responsive UI.

## Technologies 🛠
- Java 17
- Spring Boot 3
- Thymeleaf
- Maven
- WeatherAPI (external API)

## Features ✨
- Search weather by city name
- Displays current temperature, feels like, and condition
- Simple responsive UI (Thymeleaf + CSS)
- Configurable via `.env`

## Setup

First thing, you must have `JDK 17` (or higher version) installed on your computer because this is a java app.

Clone this repository:
```bash
git clone https://github.com/PredescuSebastianIon/WeatherApp.git
cd WeatherApp
```

Create a file named `.env` in the root folder, copy the content from `.env_template` in that file and complete with your key from this [weather api](https://www.weatherapi.com). (If you use other weather api, then you should modify the *WeatherResponse.java* because it was configured for this specific one).

## Compile and run :gear:

For running type `./mvnw spring-boot:run` (in linux/macOS) or `./mvnw.cmd spring-boot:run` (in windows) and the app will start in `localhost:8080` on your computer.

Just for compiling, type `./mvnw compile`.

## Live Demo :rocket:

Try the live demo right [here](https://racial-wynn-seby-b9d8b47f.koyeb.app).

## LICENSE

This project is released into the public domain under [The Unlicense](LICENSE).