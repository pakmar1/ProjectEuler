def determineMultiples():
    
    sum1=0
    for a in range(1000):
        if a % 3 == 0 or a % 5 == 0:
            sum1+=a
            
    print(sum1)

def main():
    determineMultiples()

if __name__ == "__main__":
    main()
