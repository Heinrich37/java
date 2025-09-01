pessoa ={
    "nome":"gerso",
    "idade": 48,
    "cidade":"Campo Grande"
}

def verifica_cidade(dicionario):
    if dicionario["cidade"] == "CG":
        return "È DE CAMPO GRANDE"
    else:
        return f"É de {dicionario["cidade"]}"
    
cidade_gerso = verifica_cidade(pessoa)
print (cidade_gerso)
