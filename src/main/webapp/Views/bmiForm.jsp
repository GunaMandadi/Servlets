<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BMI Calculator</title>
</head>
<body>
    <h2>Enter Height and Weight</h2>
    <form action="/bmi" method="post">
        <label for="height">Height (in inches):</label>
        <input type="number" id="height" name="height" required><br><br>
        <label for="weight">Weight (in pounds):</label>
        <input type="number" id="weight" name="weight" required><br><br>
        <input type="submit" value="Calculate BMI">
    </form>
</body>
</html>