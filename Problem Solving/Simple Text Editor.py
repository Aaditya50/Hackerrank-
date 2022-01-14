# Enter your code here. Read input from STDIN. Print output to STDOUT

string = ""
stack = []

for i in range(int(input())):
    ans = input().split()
    
    if ans[0] == '1':
        stack.append(string)
        string  += ans[1]
    elif ans[0] == '2':
        stack.append(string)
        string = string[0:len(string) - int(ans[1])]
    elif ans[0] == '3':
        print(string[int(ans[1]) - 1])
    else:
        string = stack.pop()
