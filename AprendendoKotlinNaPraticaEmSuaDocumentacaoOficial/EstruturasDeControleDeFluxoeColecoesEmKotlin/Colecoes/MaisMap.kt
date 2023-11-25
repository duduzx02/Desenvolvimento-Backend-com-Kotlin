package Colecoes

const val PONTOS_X_PASSAGENS: Int = 15

val EZPassAccounts = mutableMapOf(1 to 100, 2 to 100, 3 to 300)
val EZPassReport: Map<Int, Int> = EZPassAccounts


    fun updatePontosCreditos(accountId: Int){
        if(EZPassAccounts.containsKey(accountId)){
            println("Updating $accountId...")
            EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + PONTOS_X_PASSAGENS
        } else{
            println("Error: trying to update a non-existing account (id: $accountId)")
        }
    }

    fun accountsReport(){
        println("EZ-Pass report:")
        EZPassReport.forEach{
            k, v ->
            println("ID $k: credit $v")
        }
    }


fun main(){
    accountsReport()
    updatePontosCreditos(1)
    updatePontosCreditos(1)
    updatePontosCreditos(5)
    accountsReport()
}

