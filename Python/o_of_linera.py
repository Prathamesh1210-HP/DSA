def find_paper(papers, name):
    for paper in papers:
        if paper == name:
            return True
    return False

papers = ["Anita", "Babita", "Cat", "Doom", "Esha"]

search_name = "Cat"

result = find_paper(papers, search_name)

if result:
    print("Paper found")

else:
    print("paper not found. ")