#User function Template for python3

class Solution:
    def Anagrams(self, words, n):
        '''
        words: list of word
        n:      no of words
        return : list of group of anagram {list will be sorted in driver code (not word in grp)}
        '''
        data_set = dict()#creating a dictionary to store the set of anagrams
        data_list = [] #a final list to return back the set of anagrams
        for i in words:
            word = ''.join(sorted(i))#sorting the word into alphabetical order
            if data_set.get(word,0)==0:
                data_set[word]=[i]#if the word is not present in the dictionary,then assiging a list of value to it
            else:
                data_set[word].append(i)#if the word or the matching anagram word is already present then add it to the corresponding list
        for i in data_set:
            data_list.append(data_set[i])
            #appending the list of values to the final returning list
        return data_list
        #code here

#{ 
#  Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
if __name__ =='__main__':
    t= int(input())
    for tcs in range(t):
        n= int(input())
        words=input().split()
        
        ob = Solution()
        ans = ob.Anagrams(words,n)
        
        for grp in sorted(ans):
            for word in grp:
                print(word,end=' ')
            print()

# } Driver Code Ends
