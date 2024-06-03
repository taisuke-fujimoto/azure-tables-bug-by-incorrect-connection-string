package test

import com.azure.data.tables.TableClientBuilder

fun main() {
    val incorrectConnectionString = "DefaultEndpointsProtocol=http;AccountName=devstoreaccount1;AccountKey=incorrectAccountKey;TableEndpoint=http://127.0.0.1:10002/devstoreaccount1;"

    val tableClient = TableClientBuilder()
        .connectionString(incorrectConnectionString)
        .tableName("test")
        .buildAsyncClient()

    tableClient.createTable().block()
}
