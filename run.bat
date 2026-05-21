@echo off
echo ========================================
echo        MySQL JDBC Runner
echo ========================================

:: Change this filename to your current file
set FILENAME=RollbackDemo

echo Compiling %FILENAME%.java ...
javac -cp ".;mysql-connector-j-9.7.0.jar" %FILENAME%.java

if %errorlevel% neq 0 (
    echo.
    echo ❌ Compilation Failed!
    pause
    exit /b
)

echo.
echo Running %FILENAME% ...
echo ----------------------------------------
java -cp ".;mysql-connector-j-9.7.0.jar" %FILENAME%

echo.
echo ----------------------------------------
pause