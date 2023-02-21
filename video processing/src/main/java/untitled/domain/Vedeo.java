package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.VideoProcessingApplication;
import untitled.domain.MadeStreamingUrl;

@Entity
@Table(name = "Vedeo_table")
@Data
public class Vedeo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String url;

    @PostPersist
    public void onPostPersist() {
        MadeStreamingUrl madeStreamingUrl = new MadeStreamingUrl(this);
        madeStreamingUrl.publishAfterCommit();
    }

    public static VedeoRepository repository() {
        VedeoRepository vedeoRepository = VideoProcessingApplication.applicationContext.getBean(
            VedeoRepository.class
        );
        return vedeoRepository;
    }

    public static void videoProcess(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Vedeo vedeo = new Vedeo();
        repository().save(vedeo);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(vedeo->{
            
            vedeo // do something
            repository().save(vedeo);


         });
        */

    }
}
