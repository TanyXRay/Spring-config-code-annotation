# Практическое применение annotation Spring Framework без конфигурационного файла xml (без @Autowired/@Component!)

##### В данном проекте показана практическая реализация одного из основных абстрактных принципов вышеуказанного фрейворка - IoC (Invertional of Control) с помощью аннотаций @Configuration, @ComponentScan, @PropertySource, @Bean и без использования конфигурационного файла. 

##### При создании проекта использовался архетип-шаблон для мавен - maven-archetype-webapp

##### В файле pom.xml в зависимости для работы со Spring были добавлены библиотеки spring-core, spring-beans, spring-context.

*В ветке spring-config-manually было реализовано создание бинов вручную в конфигурационном классе SpringConfig.*
