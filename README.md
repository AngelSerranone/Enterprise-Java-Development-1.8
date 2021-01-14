## IntArrayList Vs IntVector

El uso de **IntArrayList** será adecuado cuando en nuestra aplicación tengamos menos memoria y mas capacidad computacional. Esto es debido a que esta clase ocupa menos en memoria al ser mas pequeña, pero por ese mismo motivo, si nuestro array crece muchas veces tendra que reajustarse muchas veces, y  tendrá que poner en marcha el script que lo sostiene mas veces haciendo que sea mas lento.

El uso de **IntVector** será mas adecuado cuando tengamos menos capacidad computacional y mas memoria. Esto es debido a que cada vez que  crece crece mas, por tanto no tendrá que reajustarse tan a menudo por lo que computacionalmente es mas eficiente.

