package com.example.Mulchee.service;

/*
* 1) Number of lines of text
2) Number of words (simple case, separated by spaces)
3) Number of sentences (simple case, sentence ends in `.` period)
4) Alphabetical list of palindrones (any word that is the same forward and backward),
* and the number of times each palindrone was found
*

* */

import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.List;

public class AdService {

    /*

    *** This is an architectural and design question, all functionalities are
    expected to be simply psuedo codes, but class structures and orchestrations
    are expected to be layed out clearly. ***

We currently have multiple of merchants submitting their product feeds to our
system, they all have their own formats (column naming convention, file structute
like csv or tsv ... etc).
We would like to standardize the format internally in our company so we could
further process them for other downstream operations.

Feed

Macys Feed:
  - tab delimited
  - provided columns:
  	* TITLE
  	* DESCRIPTION
  	* MSRP
  	* SALES PRICE
  	* IMAGE LINK
  	* PRODUCT URL
  	* CATEGORY

Class Feed
  func scrubSpaces()
  func scrubControlChar()
  func scrubTabs()
  func read()
  func write()
  func scrubEscape()


Class JCService extend Feed
    func fixProductType

Class MacyService extend Feed
    func cleanMrsp

WalmartService extend Feed
    func scrubSomething


func cronService()
    JCservice.scrubSpaces()
    JCservice.fixProductType()


    MacyService.scrubSpaces()
    MacyService.scrubMacyNWal()


dynamicController(Target, list[] scrub, pathToOutput)

post /url/dynamicController/

{
name: "Target",
list: ["priceScrubbing","textScrubbing", ect],
output: "c:/"
}



JC Penney Feed:
  - comma delimited
  - provided columns:
  	* Product Title
  	* Product Description
  	* Price
  	* Sale Price
  	* Img Url
  	* Link
  	* Product Type


Our desire internal feed format:
  - tab delimited
  - columns:
    * title
    * description
    * price
    * sale_price
    * img_url
    * link
    * category

def func() {

    func main() {
        List<String> listOfFeeds();
    }
}


Criteria:
1. Clean the title with extra spaces (space in front and the end, plus any > 1
spaces)
2. Clean the description by getting rid of control characters, also clean extra spaces
3. msrp and sales price we want only numeric, also if it looks like "$9.99", we want to get
rid of "$" and make it "9.99"
4. make sure image url and product url exists
5. Only keep products under "Apparel" category
    * */

    public void readFile() {
        String fileName = "path/fileToRead.text";
        BufferedReader in = new BufferedReader(Reader in, int size); // Path
        // "Alphabetical list of palindrones"
        int period = 0;  // number of sentenes
        int wordCount = 0;
        int numOfLines = 0;
        int numOfPalindrones = 0;
        List<String> listOfPalindrones;
        while (in){
            String temp = in.readLine();

            numOfLines++;
            // Count periods
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == '.') period++;
            }

            Array[] split  = temp.split(" ");

            wordCount += split.length();
            for (word in split) {
                if (palindrome(temp)) {
                    numOfPalindrones++;
                    listOfPalindrones.add(temp);
                }
            }
        }
        listOfPalindrones.sort();
    }


    public boolean palindrome(String str) {

        int len = str.length();

        int i = 0;
        int j = len - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
