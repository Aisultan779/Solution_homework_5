# Proxy & Flyweight Patterns 🏡🗺️

## 📌 Описание
Этот проект демонстрирует использование **паттернов проектирования** `Proxy` и `Flyweight` в реальных сценариях:
- `Proxy Pattern` используется для управления загрузкой изображений недвижимости.
- `Flyweight Pattern` помогает оптимизировать работу с картой, где отображаются тысячи маркеров.

## 📁 Структура проекта
```
src/
├── proxy/                     # Proxy Pattern (управление изображениями)
│   ├── Image.java
│   ├── RealImage.java
│   ├── ImageProxy.java
│   ├── ProtectedImageProxy.java
├── flyweight/                 # Flyweight Pattern (управление маркерами на карте)
│   ├── MarkerStyle.java
│   ├── MarkerStyleFactory.java
│   ├── MapMarker.java
├── model/
│   ├── User.java              # Модель пользователя
└── main/
    ├── HomeworkDemo.java      # Точка входа
```

## 🏠 Proxy Pattern: Управление изображениями недвижимости
### 🔍 Какая проблема была решена?
Загрузка **полноразмерных** изображений при каждом просмотре – это **медленно** и **неоптимально**. Мы решили эту проблему с помощью `Proxy`, загружая **миниатюры сразу**, а **полные изображения – только по запросу**.

### 🛠 Как шаблон упростил или оптимизировал дизайн?
- **Отложенная загрузка** 💾 – экономит память и ускоряет работу.
- **Защищённый доступ** 🔒 – только авторизованные агенты могут загружать/заменять изображения.
- **Принцип подстановки Барбары Лисков (LSP)** 🏗 – `Proxy` заменяет `RealImage` без изменения логики кода.

## 🗺️ Flyweight Pattern: Оптимизация маркеров на карте
### 🔍 Какая проблема была решена?
Отображение тысячи маркеров (АЗС, ресторанов, больниц) **создаёт тысячи объектов**, дублируя данные о стиле. Это ведёт к **избыточному потреблению памяти**.

### 🛠 Как шаблон упростил или оптимизировал дизайн?
- **Разделение данных** 📌 – маркеры хранят только координаты, а стиль загружается из **общего пула**.
- **Экономия памяти** 🧠 – вместо 1000+ объектов стиля создаётся всего **3 уникальных объекта**.
- **Легкость расширения** 🚀 – можно легко добавить новые стили.

### 🖥️ Ожидаемый вывод в консоли:
```
=== Proxy Pattern Demo ===
Отображение миниатюры (низкое разрешение): property1.jpg
Загрузка полноразмерного изображения: property1.jpg
Отображение полноразмерного изображения: property1.jpg
Загрузка нового изображения: property1_new.jpg от agent007
Загрузка полноразмерного изображения: property1_new.jpg
Отображение полноразмерного изображения: property1_new.jpg

=== Flyweight Pattern Demo ===
Создан новый стиль маркера: Icon: hospital, Color: red, LabelStyle: bold
Создан новый стиль маркера: Icon: restaurant, Color: blue, LabelStyle: italic
Создан новый стиль маркера: Icon: gas_station, Color: green, LabelStyle: normal

Всего маркеров: 1000
Уникальных стилей: 3
```

## 🖼️ UML Диаграмма
//www.plantuml.com/plantuml/png/hP71Ri8m38RlVOeSYzQ-0KASa7P0ciPUm0JJHNFIAd4bectlFfQimLHSqEZ9SUpl__zq7HWyZvOgunZz4JIgPmiTgizAdRydTJ1X88XlxwFTEp1KBwulDYDHsZXVV5UL9WX1lI9GnXWx45fq7AwuhTgnDwvJHqFem6A6NXRhsVtYFtPIuyNtftYVdrO4yLELzGJpGLQppFAh5QgYAGIdM5iOjk0_q9SGnh4wYJh-rNbinv5G1OuqXIY4EcqsUQcP7iFetfM3xgdtvKImHqh0MIhnxbAsM1JegIFuiYL5RZ8teBdtiQ030nlz6sgP0OsSNkNa8Tijmy9YXvoA-fxuAUxbJxJjIZAh6tRd8sjqXz7I3m00

## 🎯 Вывод
- ✅ `Proxy Pattern` улучшил производительность загрузки изображений.
- ✅ `Flyweight Pattern` снизил потребление памяти при работе с маркерами.
- ✅ Код написан по принципам **SOLID**, легко поддерживается и расширяется.

🚀 **Готово к сдаче!** 💯

