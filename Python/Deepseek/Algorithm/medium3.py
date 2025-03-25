def timeInWords(h, m):
    numbers = ["zero", "one", "two", "three", "four", 
               "five", "six", "seven", "eight", "nine", 
               "ten", "eleven", "twelve", "thirteen", 
               "fourteen", "fifteen", "sixteen", 
               "seventeen", "eighteen", "nineteen", 
               "twenty", "twenty one", "twenty two", 
               "twenty three", "twenty four", 
               "twenty five", "twenty six", 
               "twenty seven", "twenty eight", 
               "twenty nine", "thirty"]
    
    if m == 0:
        return f"{numbers[h]} o' clock"
    elif 1 <= m <= 30:
        if m == 1:
            return f"{numbers[m]} minute past {numbers[h]}"
        elif m == 15:
            return f"quarter past {numbers[h]}"
        elif m == 30:
            return f"half past {numbers[h]}"
        else:
            return f"{numbers[m]} minutes past {numbers[h]}"
    else:
        if m == 45:
            return f"quarter to {numbers[h+1]}"
        else:
            return f"{numbers[60 - m]} minutes to {numbers[h+1]}"

# Input
h = int(input("Enter hour (1-12): "))
m = int(input("Enter minutes (0-59): "))

# Output
print(timeInWords(h, m))