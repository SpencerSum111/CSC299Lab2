def returnCharacter(number):
    if number <= 9:
        return chr(number + 48)
    else:
        return chr(number - 10 + 65)  
    
def decimalConvert(base, inputNumber):
    numberToConvert = " "
    while inputNumber > 0:
        numberToConvert += returnCharacter(inputNumber%base)
        inputNumber //= base
    return numberToConvert[::-1]

number = int(input("Enter number to convert: "))
while number < 0:
    print("Number can not be negative, pleasee try again.")
    number = int(input("Enter number to convert: "))
base = int(input("Enter base: "))
while base < 2 or base > 16:
    print("Base needs to be larger than 2 and less than 16, please try again.")
    base = int(input("Enter base: "))
print("Converted number:", decimalConvert(base, number))