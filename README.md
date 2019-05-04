# Проект UI автотестов для обкатки quick-page

## Запуск всех тестов в многопоточном режиме:
```
mvn clean test
```

## Запуск конкретных тестов по тегу в многопоточном режиме:
```
mvn clean test -Dtags=@1
```

## Запуск конкретных тестов по тегу в однопоточном режиме:
```
mvn clean test -Dthreads.count=1 -Dtags=@1
```

## Запуск через TestNG плагин IntellijIdea
Необходимо добавить и настроить новую TestNG конфигурацию:
```
Test kind: Class
Class: RunCukesTest
VM options: -Ddataproviderthreadcount=${value}
```
Вместо **${value}** указать колчичество потоков, в которых будут запускаться тесты

## Формирование Allure-отчета
```
mvn allure:serve
```