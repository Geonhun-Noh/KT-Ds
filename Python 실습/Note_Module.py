'''
사용자는 Note에 뭔가를 적을 수 있다
Note에는 content가 있고, 내용을 제거할 수 있다.
Note는 Notebook에 삽입된다.
        Notebook        Note
method  add_note        write_content
        remove_note     remove_all
        get_number_of_pages

variable   title        content
            page_number
            notes
'''

class Note(object):
    def __init__(self, content=None):
        self.content=content
    
    def write_content(self,content):
        self.content=content

    def remove_all(self):
        self.content=""

    def __str__(self):
        return self.content

class NoteBook(object):
    def __init__(self,title):
        self.title=title
        self.page_number=1
        self.notes={}
    
    def add_note(self,note,page=0):
        if self.page_number<300:
            if page==0:
                self.notes[self.page_number]=note
                self.page_number += 1
            else:
                self.notes={page:note}
                self.page_number += 1
        else:
            print("Page가 모두 채워졌습니다.")

    def remove_note(self,page_number):
        if page_number in self.notes.keys():
            return self.notes.pop(page_number)
        else:
            print("해당 페이지는 존재하지 않습니다.")
    
    def get_number_of_pages(self):
        return len(self.notes.keys())