package managerposter;


public class ManagerPoster {
	
    private PostersItems[] posters = new PostersItems[0];
    int limit = 10;

    public ManagerPoster() {

    }

    public ManagerPoster(int limit) {
        this.limit = limit;
    }

    public void add(PostersItems poster) {
        int length = posters.length + 1;
        PostersItems[] tmp = new PostersItems[length];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public PostersItems[] findAll() {
        PostersItems[] result = new PostersItems[posters.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = posters[i];
        }

        return result;
    }

    public PostersItems[] findLast() {
        int count = limit;
        if (count > posters.length) {
            count = posters.length;
        }
        PostersItems[] result = new PostersItems[count];

        for (int i = 0; i < count; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }

        return result;
    }

}
