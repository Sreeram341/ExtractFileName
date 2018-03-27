class FileNameExtractor:
    def extract_file_name(dirty_file_name):
        file_leng = dirty_file_name.split('_')
      
          if len(file_leng) > 1:
        
              ndf = dirty_file_name[len(file_leng[0])+1:]
        
              new_file_leng = ndf.split('.')
        
              return(ndf[:-len(new_file_leng[len(new_file_leng)-1])-1])
