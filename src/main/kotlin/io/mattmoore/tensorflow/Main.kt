package io.mattmoore.tensorflow

import io.mattmoore.tensorflow.models.Model

fun main(args: Array<String>) {
    val model = Model.load("models/simple.pb")
    val inputData = arrayOf(floatArrayOf(4f, 3f, 2f, 1f))
    val prediction = model.predict(inputData)
    println("Prediction: $prediction")
    println(TensorFlow.version())
}
