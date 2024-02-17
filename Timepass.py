def min_rotations(s):
    counts = {'"': 0, 'V': 0, 'v': 0, '>': 0}

    for direction in s:
        if direction in counts:
            counts[direction] += 1

    max_count = 0
    for count in counts.values():
        max_count = max(max_count, count)

    return len(s) - max_count

# Test cases
print(min_rotations('"www"'))         # Output: 2
print(min_rotations('S-V>>>v'))       # Output: 3
print(min_rotations('S'))             # Output: 0
