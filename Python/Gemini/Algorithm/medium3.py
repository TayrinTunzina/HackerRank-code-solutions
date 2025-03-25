def number_to_word(num):
    """
    Converts a number (0-29) to its word representation.

    Args:
        num: The number to convert.

    Returns:
        The word representation of the number.
    """
    units = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
             "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"]
    tens = ["", "", "twenty", "thirty", "forty", "fifty"]

    if num < 20:
        return units[num]
    else:
        return tens[num // 10] + ("" if num % 10 == 0 else " " + units[num % 10])

def timeInWords(h, m):
    """
    Converts the given time in numerals to words.

    Args:
        h: The hour of the day (1-12).
        m: The minutes after the hour (0-59).

    Returns:
        A string representing the time in words.
    """
    if m == 0:
        return number_to_word(h) + " o' clock"
    elif m <= 30:
        if m == 15:
            return "quarter past " + number_to_word(h)
        elif m == 30:
            return "half past " + number_to_word(h)
        else:
            return number_to_word(m) + " minutes past " + number_to_word(h)
    else:
        if m == 45:
            return "quarter to " + number_to_word(h + 1)
        else:
            return number_to_word(60 - m) + " minutes to " + number_to_word(h + 1)

if __name__ == "__main__":
    h = int(input("Enter the hour (1-12): "))
    m = int(input("Enter the minutes (0-59): "))

    result = timeInWords(h, m)
    print(result)
