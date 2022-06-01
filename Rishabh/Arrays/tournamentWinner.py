"""
Question:

There's an algorithms tournament taking place in which teams of programmers
compete against each other to solve algorithmic problems as fast as possible.
Teams compete in a round robin, where each team faces off against all other
teams. Only two teams compete against each other at a time, and for each
competition, one team is designated the home team, while the other team is the
away team. In each competition there's always one winner and one loser; there
are no ties. A team receives 3 points if it wins and 0 points if it loses. The
winner of the tournament is the team that receives the most amount of points.

Given an array of pairs representing the teams that have competed against each
other and an array containing the results of each competition, write a
function that returns the winner of the tournament. The input arrays are named
competitions and results, respectively. The competitions array has elements in the form of
[homeTeam, awayTeam], where each team is a string of at most 30
characters representing the name of the team. The results array
contains information about the winner of each corresponding competition in the
competitions array. Specifically, results[i] denotes
the winner of competitions[i], where a 1 in the
results array means that the home team in the corresponding
competition won and a 0 means that the away team won.

It's guaranteed that exactly one team will win the tournament and that each
team will compete against all other teams exactly once. It's also guaranteed
that the tournament will always have at least two teams.
"""

"""
Sample I/O:

Input:
competitions = [
  ["HTML", "C#"],
  ["C#", "Python"],
  ["Python", "HTML"],
]

results = [0, 0, 1]

Output:
"Python"

Explanation:
- C# beats HTML, Python Beats C#, and Python Beats HTML.
- HTML - 0 points 
- C# -  3 points
- Python -  6 points
"""

def updateScore(winningTeam, teamScores):
    if winningTeam in teamScores:
        teamScores[winningTeam] += 3
    else:
        teamScores[winningTeam] = 3
    return teamScores
    
def tournamentWinner(competitions, results):
    # Write your code here.
    teamScores = dict()
    for (match, winner) in zip(competitions, results):
        print(match, winner)
        if winner == 0:
            teamScores = updateScore(match[1], teamScores)
        else:
            teamScores = updateScore(match[0], teamScores)
    tournamentWinner = [key for key, value in teamScores.items() if value == max(teamScores.values())]
    return tournamentWinner[0]

"""
TC: O(n) | SC: O(k); n = # of competition, k = # of teams

Explanation:
No explanation needed.
Simple hashmap where each team is a key and we keep adding the score for each competition.
In the end, we return the team (key) with the highest score (value).
"""