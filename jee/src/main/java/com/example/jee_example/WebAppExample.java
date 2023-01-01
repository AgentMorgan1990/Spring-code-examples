package com.example.jee_example;

/**
 *
 * Для деплоя приложения надо собрать war файл - > maven -> package  в target появится новый war с именем нашего приложения.
 * Этот файл нажо положить в папку tomcat/webapps/
 *
 * Java EE невозможно задеплоить без сервер приложений (application server) или
 * контейнеров сервлетов (Servlet containers) т.к. каждая из Java EE технологий представляет из себя набор Java-интерфейсов и абстрактных
 * классов конкретные реализации которых находятся на сервере приложений.
 *
 * Сервер приложений - предоставляют реализации практически всех технологий, входящих в стек Java EE.
 * Примерами таких серверов являются Apache TomEE (на базе контейнера сервлетов TomCat), Wildfly (ранее назывался JBoss),
 * Glassfish, IBM Websphere. Spring работает на контенерах сервлетов, т.к. внутри него очень большое кол-во дополнительных библиотек.
 *
 * Сервлет - это компонент Java EE который занимается обработкой HTTP запросов, приходящие на
 * сервер приложений.
 *
 * Для того чтобы создать сервлет нужно
 * 1. Создать класс, реализующий интерфейс javax.servlet.Servlet или какой-то из его потомков
 * 2. Привязать этот класс к URL через настройки в файле web.xml или при помощи аннотации
 * @WebServlet
 *
 * Жизненный цикл сервлета ссостоит из следующих этапов:
 *
 * 1. При запуске приложения контейнер сервлетов загружает и создает объекты всех классов,
 * которые прописаны как сервлеты в web.xml или имеют аннотацию @WebServlet
 *
 * 2. Каждый класс сервлета создается в единственном экземпляре.
 *
 * 3. После создания класса сервлета контейнер вызывает метод init(), в который в качестве
 * параметра передается реализация интерфейса ServletConfig, которая содержит информацию
 * о сервере необходимую для работы сервлета. В том числе метод getServletContext() позволяет
 * получить т.н. контекст сервлета, через который сервлет может взаимодействовать с
 * контейнером приложений. В этом методе также может размещаться дополнительная
 * пользовательская логика инициализации сервлета. Если по какой-то причине сервлет не
 * должен быть создан, то в методе init() нужно кинуть исключение типа ServetException.
 *
 * 4. Для каждого запроса вызывается метод service(). В первом параметре которого содержится
 * объект с информацией о запросе, а во втором объект для формирования ответа на запрос.
 * При достаточно большой нагрузке контейнер сервлетов может вызывать метод service() для разных запросов
 * параллельно из разных потоков. По этой причине все объекты с которыми работает метод service()
 * должны быть потокобезопасными. Следует использовать атомарные типы и коллекции из пакета
 * java.concurrency.
 *
 * 5. При завершении веб-приложения контейнер вызывает у всех сервлетов метод destroy(). В
 * этом методе следует размещать логику, связанную с освобождением ресурсов, которые
 * использовались сервлетом.
 *
 *
 * JSP и JSF – это технологии Java Server Page и Java Server Faces. Они отвечают за визуализацию
 * интернет-магазина. С их помощью будет отображаться каталог, страница с отдельным товаром и
 * корзина.
 *
 * Servlet API – Одна из основных технологий. С помощью него осуществляется взаимодействие клиента
 * и бизнес-логики приложения. Именно сервлет обрабатывает входящие HTTP-запросы. Такие
 * технологии, как JSP и JSF также используют Servlet API, для обработки запросов.
 *
 * Enterprise Java Beans (EJB) – корпоративные компоненты, отвечающие за обработку бизнес-логики
 * приложения.
 *
 * Java Persistence API (JPA) – это стандарт для объектно-реляционного отображения (ORM), которая
 * связывает данные в таблицах реляционных БД и бизнес-логику приложения, которая написана на
 * Java. Наиболее известной реализацией JPA является библиотека Hibernate.
 *
 * Java Messaging System (JMS) – это стандарт для организации асинхронного взаимодействия между
 * компонентами системы через шину сообщений.
 *
 *
 * */

public class WebAppExample {
    public static void main(String[] args) {
    }
}