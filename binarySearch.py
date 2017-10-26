def binarysearch(key,list1,begin,end,mid):
    '''Condition for binary search: List must be sorted'''
    mid = (begin+end)//2
    list1=sorted(l)

    if begin > end:
        print("Nothing Found")
        return None
    if (begin == end and key == list1[mid]):
        print(begin)
    elif (key == list1[mid]):
        print(mid)
    elif (key < list1[mid]):
        end = mid-1
        mid = (begin+end)/2
        binarysearch(key,list1,begin,end,mid)
    elif (key > list1[mid]):
        begin = mid+1
        mid = (begin+end)/2
        binarysearch(key,list1,begin,end,mid)
    
