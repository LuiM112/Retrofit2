The files includes the following creation packages:

- Adapters
- models
- viewmodel
- repositories
- views
- layout
- navigation "note this directory is mainly for future uses as stated by the tutorial."


#### adapters
consists of a file called 'BookSearchResultsAdapter'. It is used to help implement the results into layout files in order to shows the results.

#### models
Are models or methods used to obtain information of the book that was searched.
- Volume
- VolumeImageLinks
- VolumeInfo
- VolumeResponse

#### viewmodel
Used to set the required keywords and author in order to browse the API in order to find the requested search item.
- BookSearchViewModel

#### views
Uses the adapter to set the view display on the emulated device
- BookSearchFragment

#### Layout
These are the fundamental resource files that are used display on the emulated device
- activity_main.xml
- book_item
- fragment_booksearch

#### navigation
This one is completely optional but it's made for any future uses that may occur
- mynavgraph.xml
