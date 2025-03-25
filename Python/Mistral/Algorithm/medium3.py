def timeInWords(h, m):
    nums = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
            "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"]

    if m == 0:
        return f"{nums[h]} o' clock"
    elif m == 15:
        return f"quarter past {nums[h]}"
    elif m == 30:
        return f"half past {nums[h]}"
    elif m == 45:
        return f"quarter to {nums[(h % 12) + 1]}"
    elif m < 30:
        return f"{nums[m]} minutes past {nums[h]}"
    else:
        return f"{nums[60 - m]} minutes to {nums[(h % 12) + 1]}"

# Taking inputs manually
h = int(input("Enter the hour (1-12): "))
m = int(input("Enter the minutes (0-59): "))

print(timeInWords(h, m))
