# UC1: Display Empty Tic-Tac-Toe Board

board = []

# Initialize board
for i in range(3):
    row = []
    for j in range(3):
        row.append('-')
    board.append(row)

# Display board
for i in range(3):
    for j in range(3):
        print(board[i][j], end=" ")
    print()
