# Приложение с шутками, разработанное на курсе от Т-Банка

## Основные возможности

- **Управление шутками**:
  - Загрузка шуток из удаленного API.
  - Добавление, просмотр и удаление шуток локально.
  - Отображение шуток в удобном списке с возможностью просмотра подробностей.
- **Поддержка оффлайн-режима**:
  - Сохранение и загрузка шуток из локальной базы данных.
- **Автоматическая очистка**:
  - Удаление устаревших шуток по истечении времени.
- **Архитектура MVVM**:
  - Четкое разделение ответственности для улучшения читаемости и масштабируемости кода.

## Используемые технологии

### **Языки**
- **Kotlin**: Основной язык разработки проекта.

### **Архитектурные паттерны**
- **MVVM (Model-View-ViewModel)**: Обеспечивает модульную и структурированную архитектуру.
- **Clean architecture**

### **Библиотеки и инструменты**
- **Компоненты Android Jetpack**:
  - **LiveData**: Наблюдение за изменениями данных.
  - **ViewModel**: Управление данными, привязанными к жизненному циклу UI.
  - **Room**: Локальная база данных для оффлайн-хранения данных.
  - **Navigation Component**: Упрощает навигацию внутри приложения.
  - **Data Binding**: Привязка UI-компонентов к источникам данных.

- **Внедрение зависимостей**:
  - **Dagger**: Управление зависимостями в проекте.

- **Сетевое взаимодействие**:
  - **Retrofit**: Для выполнения запросов к API.

- **Асинхронное программирование**:
  - **Kotlin Coroutines**: Упрощает работу с потоками и фоновыми задачами.

- **Компоненты пользовательского интерфейса**:
  - **RecyclerView**: Эффективное отображение списков.
  - **Фрагменты**: Динамическое управление экранами приложения.

