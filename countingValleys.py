'''
https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. 
During his last hike he took exactly n steps. For every step he took, he noted if it was an uphill, U, or a downhill, D step. Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude. 
We define the following terms:
-A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
-A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.

Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
For example, if Gary's path is s = [DDUUUUDD], he first enters a valley 2 units deep. Then he climbs out an up onto a mountain 2 units high. Finally, he returns to sea level and ends his hike.

Params:
n: the number of steps Gary takes
s: a string describing his path


'''
# Note Gary starts his hike at sea level
# @params: Integer n, String s
# @returns Integer denoting the number of valleys Gary walked through
def countingValleys(n, s):
    valleys = 0
    level = 0

    # We only care about the number of times we went below sea level and came back up
    for step in s:
        if (step == "D"):
            level -= 1
        elif (step == "U"):
            level += 1
        # We just came up from a valley back to sea level
        if (level == 0 and step == "U"):
            valleys += 1
    
    return valleys

print(countingValleys(8, "UDDDUDUU"))