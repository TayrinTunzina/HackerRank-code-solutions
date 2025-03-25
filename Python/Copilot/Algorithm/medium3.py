def timeInWords(h, m):
    num_to_words = {
        1: "one", 2: "two", 3: "three", 4: "four", 5: "five", 6: "six",
        7: "seven", 8: "eight", 9: "nine", 10: "ten", 11: "eleven",
        12: "twelve", 13: "thirteen", 14: "fourteen", 15: "quarter",
        16: "sixteen", 17: "seventeen", 18: "eighteen", 19: "nineteen",
        20: "twenty", 21: "twenty one", 22: "twenty two", 23: "twenty three",
        24: "twenty four", 25: "twenty five", 26: "twenty six",
        27: "twenty seven", 28: "twenty eight", 29: "twenty nine",
        30: "half"
    }

    if m == 0:
        return f"{num_to_words[h]} o' clock"
    elif m == 1:
        return f"one minute past {num_to_words[h]}"
    elif 1 < m <= 30:
        if m == 15 or m == 30:
            return f"{num_to_words[m]} past {num_to_words[h]}"
        else:
            return f"{num_to_words[m]} minutes past {num_to_words[h]}"
    else:
        next_hour = (h % 12) + 1
        if m == 45:
            return f"{num_to_words[60 - m]} to {num_to_words[next_hour]}"
        else:
            return f"{num_to_words[60 - m]} minutes to {num_to_words[next_hour]}"

# Taking input manually
h = int(input("Enter hour (1-12): "))
m = int(input("Enter minute (0-59): "))

# Printing the time in words
print(timeInWords(h, m))
