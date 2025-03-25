def timeInWords(h, m):
    # Dictionary to map numbers to words
    num_to_words = {
        1: "one", 2: "two", 3: "three", 4: "four", 5: "five",
        6: "six", 7: "seven", 8: "eight", 9: "nine", 10: "ten",
        11: "eleven", 12: "twelve", 13: "thirteen", 14: "fourteen",
        15: "quarter", 16: "sixteen", 17: "seventeen", 18: "eighteen",
        19: "nineteen", 20: "twenty", 30: "half"
    }

    if m == 0:
        return f"{num_to_words[h]} o' clock"
    elif m <= 30:
        if m == 1:
            return f"one minute past {num_to_words[h]}"
        elif m == 15 or m == 30:
            return f"{num_to_words[m]} past {num_to_words[h]}"
        elif m <= 20:
            return f"{num_to_words[m]} minutes past {num_to_words[h]}"
        else:
            return f"{num_to_words[20]} {num_to_words[m - 20]} minutes past {num_to_words[h]}"
    else:
        remaining_minutes = 60 - m
        next_hour = h + 1 if h < 12 else 1
        if remaining_minutes == 1:
            return f"one minute to {num_to_words[next_hour]}"
        elif remaining_minutes == 15:
            return f"quarter to {num_to_words[next_hour]}"
        elif remaining_minutes <= 20:
            return f"{num_to_words[remaining_minutes]} minutes to {num_to_words[next_hour]}"
        else:
            return f"{num_to_words[20]} {num_to_words[remaining_minutes - 20]} minutes to {num_to_words[next_hour]}"

# Input
h = int(input("Enter the hour (1-12): "))
m = int(input("Enter the minutes (0-59): "))

# Output
print(timeInWords(h, m))