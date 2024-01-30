package word1.service;

import java.util.List;

import word1.Word;

public interface FileService {

	List<Word> load(String fileName);

	boolean save(String fileName, List<Word> list);

}