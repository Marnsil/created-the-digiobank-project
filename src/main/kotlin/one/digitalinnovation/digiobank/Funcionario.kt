package one.digitalinnovation.digiobank

abstract class Funcionario(
    nome:String,
    cpf: String,
    val salario: Double

) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        nome: $nome
        cpf: $cpf
        salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
    }
