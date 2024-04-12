package org.bodyrevamp.orsc

import org.bodyrevamp.orsc.trainings.TrainingListItem
import org.bodyrevamp.orsc.nutrition.NutritionListItem

val TRAININGS = arrayListOf(
    TrainingListItem(
        title = "В рамках одной тренировки",
        plan ="Тяжёлый присед на 2–6 повторений, жим гантелей и отжимания на брусьях на 6–12 повторов, а также разводку гантелей на 15–20 повторений.",
        aim = "Повышение силовых",
        time = "2:00 ч"
    ),
    TrainingListItem(
        title = "По сплитам",
        plan = "Один день работать на силу верхней части тела (2–6 повторений с 85‑95% от 1ПМ), второй день — на силу нижней части, третий день — на объём верхней (8–12 повторений с 75–85% от 1ПМ), четвёртый — на объём нижней.",
        aim = "Повышение выносливости",
        time = "1:30 ч"
    ),
    TrainingListItem(
        title = "По тренировочным циклам",
        plan = "2–4 недели работать на силу (2–6 повторений), следующие 2–4 недели — на объём мышц (8–12 повторов), и 2–4 недели — на выносливость (15 и больше повторений).",
        aim = "На объем мышц",
        time = "1:45 ч"
    ),
)


val NUTRITION = arrayListOf(
    NutritionListItem(
        image = "https://www.emcmos.ru/sites/default/files/travma_pozvonochnik.png",
        title = "Салат в капустных тарелочках",
        description = "Капуста краснокочанная - 5 шт, Редис - 7 шт., Морковь - 1 шт., Листья салата / салат - 50 г, Брокколи - 50 г, Соль - 5 г, Масло оливковое - 1 ст. л., Фасоль (уже в отварном виде) - 4 ст. л."
    ),
    NutritionListItem(
        image = "https://www.emcmos.ru/sites/default/files/travma_pozvonochnik.png",
        title = "Вегетарианская кесадилья",
        description = "Лепешки тортильи - 4 шт., Свежемолотый черный перец - 2 г, Оливковое масло - 1 ст. л. , Помидоры черри - 200 г, Сушеный чили в хлопьях - 1 щепотка, Брокколи - 100 г, Натуральны йогурт - 50 г"
    ),
)