package org.campus02.rec;

public class DemoFilesFolders {

	public static void main(String[] args) {
		
		Folder root = new Folder("root");
		root.putEntry(new File("todos","doc",1));
		root.putEntry(new File("slides","ppt",2));
		
		Folder photos = new Folder("photos");
		photos.putEntry(new File("wiese", "jpg", 4));
		photos.putEntry(new File("schnee", "png", 6));
		photos.putEntry(new File("sand", "gif", 1));
		
		root.putEntry(photos);
		
		Folder archive = new Folder("archive");
		archive.putEntry(new File("pr1","doc",2));
		
		Folder emails = new Folder("emails");
		emails.putEntry(new File("mail1","eml",1));
		emails.putEntry(new File("mail2","eml",1));
		emails.putEntry(new File("mail3","eml",1));
		archive.putEntry(emails);
		
		Folder downloads = new Folder("downloads");
		downloads.putEntry(new File("java","zip",85));
		downloads.putEntry(new File("eclipse","tar.gz",166));
		archive.putEntry(downloads);
		
		root.putEntry(archive);
		
		//TODO: test your method implementations here...
		//	root.printAll();
			
	//		root.listAllContent("");
		root.printTree("");
	}

}
