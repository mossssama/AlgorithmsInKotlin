class Search {
    companion object{

        /* ======== Linear Search ======== */
        fun linearSearch(dataToSearch:Array<Int>, key:Int):Int{

            for ((index,number) in dataToSearch.withIndex())
                if(number==key) return index

            return -1
        }
        /* ------------------------------- */

        /* ======== Binary Search ======== */
        fun binarySearch(dataToSearch:Array<Int>, key:Int):Int{
            var startIndex=0;	var endIndex=dataToSearch.size;	   var midIndex=(startIndex+endIndex)/2;

            while(startIndex<=endIndex){
                if(dataToSearch[midIndex]>key)			endIndex=midIndex-1
                else if(dataToSearch[midIndex]<key)		startIndex=midIndex+1
                else								    return midIndex
                midIndex=(startIndex+endIndex)/2
            }
            return -1
        }

    }
}