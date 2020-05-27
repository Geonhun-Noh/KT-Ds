from Note_Module import Note
from Note_Module import NoteBook

quote_book = NoteBook("The Quote Book")

new_note=Note()
new_note.write_content("Don't cry because it's over smile because it happend. -Dr. Seuss")

quote_book.add_note(new_note)

print(quote_book.get_number_of_pages())

quote_book.add_note(Note("Hello, World1"))
quote_book.add_note(Note("Hello, World2"))
quote_book.add_note(Note("Hello, World3"))
quote_book.add_note(Note("Hello, World4"))
quote_book.add_note(Note("Hello, World5"))

print(quote_book.get_number_of_pages())

my_note=quote_book.remove_note(1)
print(my_note)

print(quote_book.get_number_of_pages())